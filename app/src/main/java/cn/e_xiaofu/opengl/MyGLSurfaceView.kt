package cn.e_xiaofu.opengl

import android.content.Context
import android.opengl.GLSurfaceView
import android.util.AttributeSet
import android.view.SurfaceView


/**
 * @author 袁希望
 * created on :2021/6/8 11:38
 */
class MyGLSurfaceView:GLSurfaceView {
    private var mGLRender:MyGLRender
    private val mNativeRender by lazy {
        MyNativeRender()
    }
    constructor(context:Context):this(context, null)
    constructor(context:Context, attrs:AttributeSet?):super(context, attrs)

    init {
        setEGLContextClientVersion(3)
        mGLRender = MyGLRender(mNativeRender)
        setRenderer(mGLRender)
        renderMode = RENDERMODE_CONTINUOUSLY
    }
}