from Notification import Notification

class SmsNotification (Notification):

    def send(self, message: str):
        print("Sending SMS notification:", message)