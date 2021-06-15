package cn.e_xiaofu.opengl

/**
 * @author 袁希望
 * created on :2021/6/8 11:47
 * description:// TODO 2021/6/8 11:47
 */
class MyNativeRender {
    companion object{
        init {
            System.loadLibrary("native-render")
        }
    }

    external fun nativeOnInit()
    external fun nativeOnUnInit()
    external fun nativeSetImageData(format: Int, width: Int, height: Int, bytes: ByteArray?)
    external fun nativeOnSurfaceCreated()
    external fun nativeOnSurfaceChanged(width: Int, height: Int)
    external fun nativeOnDrawFrame()
}