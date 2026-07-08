from Notification import Notification

class PushNotification (Notification):

    def send(self, message: str):
        print("Sending Push notification:", message)