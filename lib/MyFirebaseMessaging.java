class MyFirebaseMessaging extends FirebaseMessaging {
  @override
  Future<void> onMessage(RemoteMessage message) async {
    print('FCM Message received: ${message.notification?.body}');
  }

  @override
  Future<void> onBackgroundMessage(RemoteMessage message) async {
    print('FCM Background Message received: ${message.notification?.body}');
  }

  @override
  Future<void> onTokenRefresh() async {
    String token = await getToken();
    print('FCM Token: $token');
  }
}