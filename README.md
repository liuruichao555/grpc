# grpc
    1. mptest1
        ```
        protoc --java_out=../java/ maptest1.proto
        protoc --plugin=protoc-gen-grpc-java=/Users/liuruichao/develop/opensource/grpc-java/compiler/build/exe/java_plugin/protoc-gen-grpc-java --grpc-java_out=../java/ maptet1.proto
        ```