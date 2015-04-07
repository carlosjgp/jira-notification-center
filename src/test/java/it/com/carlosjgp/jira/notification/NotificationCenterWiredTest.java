package it.com.carlosjgp.jira.notification;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.atlassian.plugins.osgi.test.AtlassianPluginsTestRunner;
import com.carlosjgp.jira.notification.NotificationCenter;
import com.atlassian.sal.api.ApplicationProperties;

import static org.junit.Assert.assertEquals;

@RunWith(AtlassianPluginsTestRunner.class)
public class NotificationCenterWiredTest
{
    private final ApplicationProperties applicationProperties;
    private final NotificationCenter myPluginComponent;

    public NotificationCenterWiredTest(ApplicationProperties applicationProperties,NotificationCenter myPluginComponent)
    {
        this.applicationProperties = applicationProperties;
        this.myPluginComponent = myPluginComponent;
    }

    @Test
    public void testMyName()
    {
        assertEquals("names do not match!", "myComponent:" + applicationProperties.getDisplayName(),myPluginComponent.getName());
    }
}
