package com.startup.saas.provider;

import com.startup.saas.api.model.Follow;
import com.startup.saas.api.model.Post;
import com.startup.saas.api.model.Topic;
import com.startup.saas.api.resource.TopicsResource;
import org.springframework.stereotype.Service;

import javax.ws.rs.HeaderParam;

@Service
public class TopicsResourceImpl implements TopicsResource {


	@Override
	public PostTopicsResponse postTopics(Topic entity) throws Exception {
		return null;
	}

	@Override
	public GetTopicsByFieldSelectorsResponse getTopicsByFieldSelectors(String fieldSelectors, String sign) throws Exception {
        System.out.println(sign);
		return null;
	}

	@Override
	public GetTopicsByTopicIdResponse getTopicsByTopicId(String topicId, @HeaderParam("x-la-authorization") String xLaAuthorization, @HeaderParam("x-la-format") XLaFormat xLaFormat, @HeaderParam("x-la-app-key") String xLaAppKey, @HeaderParam("x-la-sign-method") XLaSignMethod xLaSignMethod, String sign) throws Exception {
		return null;
	}

	@Override
	public PatchTopicsByTopicIdResponse patchTopicsByTopicId(String topicId, @HeaderParam("x-la-session") String xLaSession, @HeaderParam("x-la-authorization") String xLaAuthorization, @HeaderParam("x-la-modified-since") Integer xLaModifiedSince, @HeaderParam("x-la-modified") XLaModified xLaModified, @HeaderParam("x-la-format") XLaFormat xLaFormat, @HeaderParam("x-la-app-key") String xLaAppKey, @HeaderParam("x-la-sign-method") XLaSignMethod xLaSignMethod, String sign, Topic entity) throws Exception {
		return null;
	}

	@Override
	public DeleteTopicsByTopicIdResponse deleteTopicsByTopicId(String topicId, @HeaderParam("x-la-session") String xLaSession, @HeaderParam("x-la-authorization") String xLaAuthorization, @HeaderParam("x-la-format") XLaFormat xLaFormat, @HeaderParam("x-la-app-key") String xLaAppKey, @HeaderParam("x-la-sign-method") XLaSignMethod xLaSignMethod, String sign) throws Exception {
		return null;
	}

	@Override
	public PostTopicsByTopicIdPublishResponse postTopicsByTopicIdPublish(String topicId, @HeaderParam("x-la-session") String xLaSession, @HeaderParam("x-la-authorization") String xLaAuthorization, @HeaderParam("x-la-format") XLaFormat xLaFormat, @HeaderParam("x-la-app-key") String xLaAppKey, @HeaderParam("x-la-sign-method") XLaSignMethod xLaSignMethod, String sign, Post entity) throws Exception {
		return null;
	}

	@Override
	public PostTopicsByTopicIdFollowResponse postTopicsByTopicIdFollow(String topicId, @HeaderParam("x-la-session") String xLaSession, @HeaderParam("x-la-authorization") String xLaAuthorization, @HeaderParam("x-la-format") XLaFormat xLaFormat, @HeaderParam("x-la-app-key") String xLaAppKey, @HeaderParam("x-la-sign-method") XLaSignMethod xLaSignMethod, String sign, Follow entity) throws Exception {
		return null;
	}
}
