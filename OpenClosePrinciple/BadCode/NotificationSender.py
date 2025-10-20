from typing import List
from NotificationType import NotificationType

class NotificationSender: 
    
    def send_notification(self, notification_types: List[NotificationType]):
        for notification_type in notification_types:
            if notification_type == NotificationType.EMAIL:
                notification_type.sendEmailNotification("Hello via Email")
            elif notification_type == NotificationType.SMS:
                notification_type.sendSMSNotification("Hello via SMS")
            elif notification_type == NotificationType.PUSH:
                notification_type.sendPushNotification("Hello via Push Notification")



