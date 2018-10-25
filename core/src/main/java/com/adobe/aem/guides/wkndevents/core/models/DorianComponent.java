package com.adobe.aem.guides.wkndevents.core.models;

import javax.annotation.Nullable;

import com.adobe.cq.export.json.ComponentExporter;

public interface DorianComponent extends ComponentExporter {

    /**
     * Test Text
     *
     * @return
     */
    @Nullable
    public String getTestText();
}