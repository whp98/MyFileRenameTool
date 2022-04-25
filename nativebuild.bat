rem bat script "nativebuild.bat"
@call "C:\Program Files\Microsoft Visual Studio\2022\Community\VC\Auxiliary\Build\vcvars64.bat"
mvn clean gluonfx:build
