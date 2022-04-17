package com.manrason.reddit.repository;

import com.manrason.reddit.dto.PostResponse;
import com.manrason.reddit.model.Post;
import com.manrason.reddit.model.Subreddit;
import com.manrason.reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
