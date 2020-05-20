
package com.douyin.open.client;

import com.douyin.open.ApiException;
import com.douyin.open.model.CommonResponse;
import com.douyin.open.model.VideoCommentListResponse;
import com.douyin.open.model.VideoCommentReplyBody;
import com.douyin.open.model.VideoCommentTopBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for VideoCommentApi
 */
@Ignore
public class VideoCommentApiTest {

    private final VideoCommentApi client = new VideoCommentApi();

    /**
     * 评论列表
     *
     * * Scope: &#x60;video.comment&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoCommentListGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        Long count = 10;
        String itemId = "itemId_example";
        Integer cursor = 0;
        VideoCommentListResponse response = client.videoCommentListGet(openId, accessToken, count, itemId, cursor);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 评论回复列表
     *
     * * Scope: &#x60;video.comment&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoCommentReplyListGetTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        Integer count = 10;
        String itemId = "itemId_example";
        String commentId = "commentId_example";
        Integer cursor = 0;
        VideoCommentListResponse response = client.videoCommentReplyListGet(openId, accessToken, count, itemId, commentId, cursor);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 回复视频评论
     *
     * * Scope: &#x60;video.comment&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoCommentReplyPostTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        VideoCommentReplyBody body = new VideoCommentReplyBody();
        CommonResponse response = client.videoCommentReplyPost(openId, accessToken, body);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 置顶视频评论(企业号)
     *
     * * Scope: &#x60;video.comment&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoCommentTopPostTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        VideoCommentTopBody body = new VideoCommentTopBody();
        CommonResponse response = client.videoCommentTopPost(openId, accessToken, body);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}
