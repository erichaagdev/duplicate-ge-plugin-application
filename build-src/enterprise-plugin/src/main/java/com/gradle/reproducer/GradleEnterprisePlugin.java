package com.gradle.reproducer;

import org.gradle.api.Plugin;
import org.gradle.api.initialization.Settings;
import com.gradle.enterprise.gradleplugin.GradleEnterpriseExtension;

class GradleEnterprisePlugin implements Plugin<Settings> {

    @Override
    public void apply(Settings settings) {
        settings.getPluginManager().apply("com.gradle.enterprise");
    }
}
