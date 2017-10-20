/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_jvoicexml_implementation_kinect_KinectRecognizer */

#ifndef _Included_org_jvoicexml_implementation_kinect_KinectRecognizer
#define _Included_org_jvoicexml_implementation_kinect_KinectRecognizer
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     org_jvoicexml_implementation_kinect_KinectRecognizer
 * Method:    kinectAllocate
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_org_jvoicexml_implementation_kinect_KinectRecognizer_kinectAllocate
  (JNIEnv *, jobject);

/*
 * Class:     org_jvoicexml_implementation_kinect_KinectRecognizer
 * Method:    kinectRecognizeSpeech
 * Signature: (J)Lorg/jvoicexml/implementation/kinect/RecognitionResult;
 */
JNIEXPORT jobject JNICALL Java_org_jvoicexml_implementation_kinect_KinectRecognizer_kinectRecognizeSpeech
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_jvoicexml_implementation_kinect_KinectRecognizer
 * Method:    kinectStopRecognition
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_org_jvoicexml_implementation_kinect_KinectRecognizer_kinectStopRecognition
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_jvoicexml_implementation_kinect_KinectRecognizer
 * Method:    kinectDeallocate
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_org_jvoicexml_implementation_kinect_KinectRecognizer_kinectDeallocate
  (JNIEnv *, jobject, jlong);

#ifdef __cplusplus
}
#endif
#endif