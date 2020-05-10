package cn.edu.sdwu.android02.classroom.sn170507180114;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.media.ImageReader;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.TextureView;
import android.view.View;

public class Ch16Activity1 extends AppCompatActivity {
    private TextureView textureView;

    private SurfaceTexture surfaceTexture;

    private CameraDevice.StateCallback stateCallback;

    private CameraDevice cameraDevice;

    private CaptureRequest.Builder captureRequestBuilder;//请求的构造器

    private CaptureRequest previewRequest;

    private CameraCaptureSession cameraCaptureSession;

    private ImageReader imageReader;//接收相机生成的静态图像

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch16_1);
    }
    public void call(View view){


        }
}