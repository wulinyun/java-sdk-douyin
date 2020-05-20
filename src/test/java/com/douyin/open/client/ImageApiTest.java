
package com.douyin.open.client;

import com.douyin.open.ApiException;
import java.io.File;
import com.douyin.open.model.ImageCreateBody;
import com.douyin.open.model.ImageCreateResponse;
import com.douyin.open.model.ImageUploadResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
/**
 * API tests for ImageApi
 */
@Ignore
public class ImageApiTest {

    private final ImageApi client = new ImageApi();

    /**
     * 发布图片
     *
     * * Scope: &#x60;video.create&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageCreatePostTest() throws ApiException {
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        ImageCreateBody body = new ImageCreateBody();
        ImageCreateResponse response = client.imageCreatePost(openId, accessToken, body);

        // TODO: 检验返回结果
        System.out.println(response);
    }
    /**
     * 上传图片到文件服务器
     *
     * * Scope: &#x60;video.create&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageUploadPostTest() throws ApiException {
        File image = new File("/path/to/file");
        String openId = "ba253642-0590-40bc-9bdf-9a1334b94059";
        String accessToken = "act.1d1021d2aee3d41fee2d2add43456badMFZnrhFhfWotu3Ecuiuka27L56lr";
        ImageUploadResponse response = client.imageUploadPost(image, openId, accessToken);

        // TODO: 检验返回结果
        System.out.println(response);
    }
}
