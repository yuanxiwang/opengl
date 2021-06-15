package cn.e_xiaofu.opengl

import android.opengl.GLSurfaceView
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

/**
 * @author 袁希望
 * created on :2021/6/15 10:39
 * description:// TODO 2021/6/15 10:39
 */
class MyGLRender(myNativeRender: MyNativeRender):GLSurfaceView.Renderer {
    private lateinit var mNativeRender: MyNativeRender
    override fun onSurfaceCreated(gl: GL10?, config: EGLConfig?) {

    }

    override fun onSurfaceChanged(gl: GL10?, width: Int, height: Int) {

    }

    override fun onDrawFrame(gl: GL10?) {

    }
}