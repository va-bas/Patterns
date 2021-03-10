package com.vabas.patterns.observer;

import java.util.List;

public interface Observer {
    public void handleEvent(List<String> news);
}
