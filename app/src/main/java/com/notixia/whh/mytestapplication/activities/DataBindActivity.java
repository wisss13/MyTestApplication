package com.notixia.whh.mytestapplication.activities;

import android.content.res.Resources;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.widget.Toast;

import com.notixia.whh.mytestapplication.R;
import com.notixia.whh.mytestapplication.adapter.PostsAdapter;
import com.notixia.whh.mytestapplication.databinding.ActivityDataBindBinding;
import com.notixia.whh.mytestapplication.domain.Post;
import com.notixia.whh.mytestapplication.domain.User;
import com.notixia.whh.mytestapplication.handlers.ClickHandlers;
import com.notixia.whh.mytestapplication.utils.GridSpacingItemDecoration;

import java.util.ArrayList;

public class DataBindActivity extends AppCompatActivity implements PostsAdapter.PostsAdapterListener{

    private User user;
    private ClickHandlers handlers;
    private PostsAdapter mAdapter;
    private RecyclerView recyclerView;
    private ActivityDataBindBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_bind);

        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setTitle(R.string.toolbar_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       /* user = new User();
        //user.name.set("Hraiech Wissem");
        user.setName("Hraiech Wissem");
        user.setEmail("wissem.hraiech@gmail.com");
        user.setProfileImage("https://api.androidhive.info/images/nature/david.jpg");

        binding.setUser(user);

        handlers = new ClickHandlers(this);
        binding.setHandlers(handlers);*/

        handlers = new ClickHandlers(this);

        renderProfile();

        initRecyclerView();
    }

    /**
     * Renders RecyclerView with Grid Images in 3 columns
     */
    private void initRecyclerView() {
        recyclerView = binding.content.recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(3, dpToPx(4), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setNestedScrollingEnabled(false);
        mAdapter = new PostsAdapter(getPosts(), this);
        recyclerView.setAdapter(mAdapter);
    }

    /**
     * Renders user profile data
     */
    private void renderProfile() {
        user = new User();
        user.setName("Wissem Hraiech");
        user.setEmail("wissss13@hotmail.fr");
        user.setProfileImage("https://firebasestorage.googleapis.com/v0/b/immigration-quebec.appspot.com/o/wissem.jpg?alt=media&token=a690e6bd-c40f-4318-b4ad-647031710c63");
        user.setAbout("Android Developer");

        // ObservableField doesn't have setter method, instead will
        // be called using set() method
        user.numberOfPosts.set(3400L);
        user.numberOfFollowers.set(3050890L);
        user.numberOfFollowing.set(150L);


        // display user
        binding.setUser(user);

        // assign click handlers
        binding.content.setHandlers(handlers);
    }

    private ArrayList<Post> getPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            Post post = new Post();
            post.setImageUrl("https://api.androidhive.info/images/nature/" + i + ".jpg");

            posts.add(post);
        }

        return posts;
    }

    @Override
    public void onPostClicked(Post post) {
        Toast.makeText(getApplicationContext(), "Post clicked! " + post.getImageUrl(), Toast.LENGTH_SHORT).show();
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }

}
