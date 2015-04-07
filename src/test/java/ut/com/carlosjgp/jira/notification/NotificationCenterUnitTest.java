package ut.com.carlosjgp.jira.notification;

import org.junit.Test;
import com.carlosjgp.jira.notification.NotificationCenter;
import com.carlosjgp.jira.notification.NotificationCenterImpl;

import static org.junit.Assert.assertEquals;

public class NotificationCenterUnitTest
{
    @Test
    public void testMyName()
    {
        NotificationCenter component = new NotificationCenterImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}
