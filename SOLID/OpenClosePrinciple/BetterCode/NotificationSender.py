from Notification import Notification
from typing import List

from EmailNotification import EmailNotification
from SmsNotification import SmsNotification
from PushNotification import PushNotification


class NotificationSender: 
    def send_notification(self, notifications: List[Notification]):
        for notification in notifications:
             notification.send("Hello via Notification")


def main():
    sender = NotificationSender()
    notifications: List[Notification] = [
        EmailNotification(),
        SmsNotification(),
        PushNotification(),
        EmailNotification(),
        SmsNotification(),
        PushNotification(),
        EmailNotification(),
        SmsNotification(),
        PushNotification(),

    ]

    sender.send_notification(notifications)

main()