package com.leweiyou.framework.i18n;

import java.io.IOException;
import java.util.Properties;

import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * 通过通配符，加载I18N资源文件
 */
public class MultipleMessageSource extends ReloadableResourceBundleMessageSource {
	private static final String PROPERTIES_SUFFIX = ".properties";
	private ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

	@Override
	protected PropertiesHolder refreshProperties(String filename, PropertiesHolder propHolder) {
		Properties properties = new Properties();
		long lastModified = -1;
		try {
			Resource[] resources = resolver.getResources(filename + "*" + PROPERTIES_SUFFIX);
			for (Resource resource : resources) {
				String sourcePath = resource.getURI().toString().replace(PROPERTIES_SUFFIX, "");
				PropertiesHolder holder = super.refreshProperties(sourcePath, propHolder);
				properties.putAll(holder.getProperties());
				if (lastModified < resource.lastModified())
					lastModified = resource.lastModified();
			}
		} catch (IOException ignored) {
		}
		return new PropertiesHolder(properties, lastModified);
	}
}