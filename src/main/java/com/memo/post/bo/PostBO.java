package com.memo.post.bo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.memo.post.domain.Post;
import com.memo.post.mapper.PostMapper;

@Service
public class PostBO {
	
	@Autowired
	private PostMapper postMapper;
	
	//  input: 로그인 된 사람의 userId
	// output: List<Post>
		public List<Post> getPostListByUserId(int userId) {
			return postMapper.selectPostListByUserId(userId);
		}
		
		public Map<String, Object> addPost()
	}
