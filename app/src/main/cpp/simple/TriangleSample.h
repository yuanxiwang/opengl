//
// Created by 袁希望 on 2021/6/11.
//

#ifndef OPENGL_TRIANGLESAMPLE_H
#define OPENGL_TRIANGLESAMPLE_H
#include "TriangleSample.h"
#include "../render/MyGLRenderContext.h"
#include "../util/LogUtil.h"

class TriangleSample {
    TriangleSample();

    ~TriangleSample();
    Init();
    Draw();
    private
        int m_ProgramObj;
        GLuint m_VertexShader, m_FragmentShader;

};


#endif //OPENGL_TRIANGLESAMPLE_H
