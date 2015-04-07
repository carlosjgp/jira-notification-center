package com.carlosjgp.jira.notification;

import com.atlassian.sal.api.ApplicationProperties;

public class NotificationCenterImpl implements NotificationCenter
{
    private final ApplicationProperties applicationProperties;

    public NotificationCenterImpl(ApplicationProperties applicationProperties)
    {
        this.applicationProperties = applicationProperties;
    }

    public String getName()
    {
        if(null != applicationProperties)
        {
            return "myComponent:" + applicationProperties.getDisplayName();
        }

        return "myComponent";
    }
}
