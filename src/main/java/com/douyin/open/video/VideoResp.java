package com.douyin.open.video;

import com.google.gson.annotations.SerializedName;

public class VideoResp {
}

class InitUploadData {
    @SerializedName("description")
    public String description;
    @SerializedName("error_code")
    public Long errorCode;
    @SerializedName("upload_id")
    public String uploadId;
}

class InitUploadResp {
    InitUploadData data;
}

class VideoInfo {
    @SerializedName("video_id")
    String videoId;
    @SerializedName("width")
    Long width;
    @SerializedName("height")
    Long height;
}

class CompleteUploadData {
    @SerializedName("description")
    public String description;
    @SerializedName("error_code")
    public Long errorCode;
    @SerializedName("video")
    public VideoInfo video;
}

class CompleteUploadResp {
    CompleteUploadData data;
}
