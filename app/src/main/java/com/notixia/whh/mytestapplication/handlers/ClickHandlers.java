package com.notixia.whh.mytestapplication.handlers;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.Toast;

import com.notixia.whh.mytestapplication.domain.User;

public class ClickHandlers {

    Context mContext;

    public ClickHandlers(Context context) {
        this.mContext = context;
    }

    public void onFabClicked(View view) {
        Toast.makeText(mContext, "FAB clicked!", Toast.LENGTH_SHORT).show();
    }

    /**
     * Demonstrating updating bind data
     * Profile name, number of posts and profile image
     * will be updated on Fab click
     */
    public void onProfileFabClicked(View view, User user) {
        user.setName("Sir Ouissem HRAIECH");
        user.setProfileImage("https://api.androidhive.info/images/nature/david1.jpg");

        // updating ObservableField
        user.numberOfPosts.set(5500L);
        user.numberOfFollowers.set(5050890L);
        user.numberOfFollowing.set(180L);
    }

    public void onButtonClickWithParam(View view, User user) {
        Toast.makeText(mContext, "Button clicked! Name: " + user.getName(), Toast.LENGTH_SHORT).show();
        user.setName("Ouissem");
        user.setEmail("wisss13@hotmail.fr");
        /*user.name.set("wisss13");
        user.email.set("wiss_hr@yahoo.fr");*/
    }

    public boolean onProfileImageLongPressed(View view) {
        Toast.makeText(mContext, "Profile image long pressed!", Toast.LENGTH_LONG).show();
        return false;
    }

    public void onFollowersClicked(View view) {
        Toast.makeText(mContext, "Followers is clicked!", Toast.LENGTH_SHORT).show();
    }

    public void onFollowingClicked(View view) {
        Toast.makeText(mContext, "Following is clicked!", Toast.LENGTH_SHORT).show();
    }

    public void onPostsClicked(View view) {
        Toast.makeText(mContext, "Posts is clicked!", Toast.LENGTH_SHORT).show();
    }

}
