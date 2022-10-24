package twikiie.mg.learnmalagasy;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.os.Build;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String CANAL = "MyNotifCanal";

    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        String titre = remoteMessage.getNotification().getTitle();
        String message = remoteMessage.getNotification().getBody();
        String icon = remoteMessage.getNotification().getIcon();

        Log.d("FIREBASEMESSAGETEST", "Vous venez de recevoir un message :" + message);
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this, CANAL);
        notificationBuilder.setContentTitle(titre);
        notificationBuilder.setContentText(message);
        notificationBuilder.setSmallIcon(IconCompat.createWithContentUri(icon));

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            String channelId = getString(R.string.notification_channel_id);
            String channelTitle = getString(R.string.notification_channel_title);
            String channelDescription = getString(R.string.notification_channel_description);

            NotificationChannel notificationChannel = new NotificationChannel(channelId,channelTitle, NotificationManager.IMPORTANCE_DEFAULT);
            notificationChannel.setDescription(channelDescription);
            notificationManager.createNotificationChannel(notificationChannel);
            notificationBuilder.setChannelId(channelId);
        }
        notificationManager.notify(1,notificationBuilder.build());
    }

}
