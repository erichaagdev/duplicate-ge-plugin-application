package com.gradle.reproducer;

import org.gradle.api.Plugin;
import org.gradle.api.initialization.Settings;
import com.gradle.enterprise.gradleplugin.GradleEnterpriseExtension;

class GradleEnterprisePlugin implements Plugin<Settings> {

    @Override
    public void apply(Settings settings) {
        settings.getPluginManager().apply("com.gradle.enterprise");

        GradleEnterpriseExtension extension = settings.getExtensions().getByType(GradleEnterpriseExtension.class);
        extension.getBuildScan().publishAlways();
        extension.getBuildScan().setTermsOfServiceUrl("https://gradle.com/terms-of-service");
        extension.getBuildScan().setTermsOfServiceAgree("yes");
    }
}
