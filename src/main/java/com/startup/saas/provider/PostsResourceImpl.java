package com.startup.saas.provider;

import com.startup.saas.api.model.LikeUpdate;
import com.startup.saas.api.model.Post;
import com.startup.saas.api.model.Review;
import com.startup.saas.api.resource.PostsResource;
import org.springframework.stereotype.Service;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;

@Service
public class PostsResourceImpl implements PostsResource {


	@Override
	public GetPostsByFieldSelectorsResponse getPostsByFieldSelectors(String fieldSelectors, @HeaderParam("x-la-authorization") String xLaAuthorization, @HeaderParam("x-la-format") XLaFormat xLaFormat, @HeaderParam("x-la-app-key") String xLaAppKey, @HeaderParam("x-la-sign-method") XLaSignMethod xLaSignMethod, String keywords, int topicId, @DefaultValue("10") int count, @DefaultValue("1") int start, String sign) throws Exception {
		return null;
	}

	@Override
	public GetPostsByPostIdResponse getPostsByPostId(String postId, @HeaderParam("x-la-authorization") String xLaAuthorization, @HeaderParam("x-la-format") XLaFormat xLaFormat, @HeaderParam("x-la-app-key") String xLaAppKey, @HeaderParam("x-la-sign-method") XLaSignMethod xLaSignMethod, String sign) throws Exception {
		return null;
	}

	@Override
	public PatchPostsByPostIdResponse patchPostsByPostId(String postId, @HeaderParam("x-la-session") String xLaSession, @HeaderParam("x-la-authorization") String xLaAuthorization, @HeaderParam("x-la-modified-since") Integer xLaModifiedSince, @HeaderParam("x-la-modified") XLaModified xLaModified, @HeaderParam("x-la-format") XLaFormat xLaFormat, @HeaderParam("x-la-app-key") String xLaAppKey, @HeaderParam("x-la-sign-method") XLaSignMethod xLaSignMethod, String sign, Post entity) throws Exception {
		return null;
	}

	@Override
	public DeletePostsByPostIdResponse deletePostsByPostId(String postId, @HeaderParam("x-la-session") String xLaSession, @HeaderParam("x-la-authorization") String xLaAuthorization, @HeaderParam("x-la-format") XLaFormat xLaFormat, @HeaderParam("x-la-app-key") String xLaAppKey, @HeaderParam("x-la-sign-method") XLaSignMethod xLaSignMethod, String sign) throws Exception {
		return null;
	}

	@Override
	public PostPostsByPostIdLikeResponse postPostsByPostIdLike(String postId, @HeaderParam("x-la-format") XLaFormat xLaFormat, @HeaderParam("x-la-app-key") String xLaAppKey, @HeaderParam("x-la-sign-method") XLaSignMethod xLaSignMethod, String sign, LikeUpdate entity) throws Exception {
		return null;
	}

	@Override
	public PostPostsByPostIdReviewResponse postPostsByPostIdReview(String postId, @HeaderParam("x-la-session") String xLaSession, @HeaderParam("x-la-authorization") String xLaAuthorization, @HeaderParam("x-la-format") XLaFormat xLaFormat, @HeaderParam("x-la-app-key") String xLaAppKey, @HeaderParam("x-la-sign-method") XLaSignMethod xLaSignMethod, String sign, Review entity) throws Exception {
		return null;
	}

	@Override
	public DeletePostsByPostIdReviewByReviewIdResponse deletePostsByPostIdReviewByReviewId(String reviewId, String postId, @HeaderParam("x-la-session") String xLaSession, @HeaderParam("x-la-authorization") String xLaAuthorization) throws Exception {
		return null;
	}
}
