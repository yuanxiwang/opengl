package cn.e_xiaofu.opengl

import android.opengl.GLSurfaceView
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

/**
 * @author 袁希望
 */
class MyGLRender(myNativeRender: MyNativeRender):GLSurfaceView.Renderer {
    private var mNativeRender: MyNativeRender = myNativeRender
    override fun onSurfaceCreated(gl: GL10?, config: EGLConfig?) {
        mNativeRender.nativeOnSurfaceCreated()
    }

    override fun onSurfaceChanged(gl: GL10?, width: Int, height: Int) {
        mNativeRender.nativeOnSurfaceChanged(width, height)
    }

    override fun onDrawFrame(gl: GL10?) {
        mNativeRender.nativeOnDrawFrame()
    }
}