package com.adobe.aem.guides.wkndevents.core.models.impl;

import com.adobe.aem.guides.wkndevents.core.models.DorianComponent;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.models.annotations.*;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(
        adaptables = SlingHttpServletRequest.class,
        adapters = {DorianComponent.class, ComponentExporter.class},
        resourceType = DorianComponentImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(
        name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION
)
public class DorianComponentImpl implements DorianComponent {

    static final String RESOURCE_TYPE = "wknd-events/components/content/dorian_component";

    static final String TEST_TEXT   = "testText";

    private static final Logger log = LoggerFactory.getLogger(DorianComponentImpl.class);

    @ScriptVariable
    private ValueMap properties;


    @Override
    public String getExportedType() {
        return RESOURCE_TYPE;
    }

    @Override
    public String getTestText() {
        return properties.get(TEST_TEXT, String.class);
    }

}