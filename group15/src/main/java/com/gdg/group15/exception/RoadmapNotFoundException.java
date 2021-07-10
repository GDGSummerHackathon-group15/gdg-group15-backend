package com.gdg.group15.exception;

public class RoadmapNotFoundException extends ElementNotFoundException{
    public RoadmapNotFoundException() {
        super("로드맵을 찾을 수 없습니다.");
    }
}
