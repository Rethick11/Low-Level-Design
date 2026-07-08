from Notification import Notification

class EmailNotification (Notification):

    def send(self, message: str):
        print("Sending Email notification:", message)