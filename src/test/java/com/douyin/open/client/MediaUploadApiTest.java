
package com.douyin.open.client;

import com.douyin.open.ApiException;
import java.io.File;
import com.douyin.open.model.MediaUploadResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for MediaUploadApi
 */
@Ignore
public class MediaUploadApiTest {

    private final MediaUploadApi client = new MediaUploadApi();

    /**
     * 上传素材
     *
     * * Scope: &#x60;im&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mediaUploadPostTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        File media = new File("/path/to/file");
        MediaUploadResponse response = client.mediaUploadPost(openId, accessToken, media);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}
