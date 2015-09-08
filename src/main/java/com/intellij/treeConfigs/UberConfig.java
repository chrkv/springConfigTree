package com.intellij.treeConfigs;

import org.apache.commons.logging.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:META-INF/main.xml")
public class UberConfig {
    private static final Log LOG = LogFactory.getLog(UberConfig.class);

}

/*
{
  "modules": [
    {
      "name": "TreeConfigs",
      "facets": [
        {
          "filesets": [
            {
              "name": "MyApp",
              "models": [],
              "activeProfiles": [],
              "dependencyFileSets": [],
              "propertiesFiles": [],
              "autodetected": false,
              "removed": false
            },
            {
              "name": "d2",
              "models": [
                {
                  "name": "src/main/resources/META-INF/d2.xml",
                  "type": "XML",
                  "dependencies": [],
                  "scope": "SOURCE"
                }
              ],
              "activeProfiles": [],
              "dependencyFileSets": [
                "fileset1"
              ],
              "propertiesFiles": [],
              "autodetected": false,
              "removed": false
            },
            {
              "name": "fileset1",
              "models": [
                {
                  "name": "src/main/resources/META-INF/main.xml",
                  "type": "XML",
                  "dependencies": [
                    {
                      "modelName": "src/main/resources/META-INF/a.xml",
                      "dependencyType": "IMPORT_RESOURCE"
                    },
                    {
                      "modelName": "src/main/resources/META-INF/b.xml",
                      "dependencyType": "IMPORT_RESOURCE"
                    }
                  ],
                  "scope": "SOURCE"
                },
                {
                  "name": "src/main/resources/META-INF/a.xml",
                  "type": "XML",
                  "dependencies": [
                    {
                      "modelName": "src/main/resources/META-INF/f.xml",
                      "dependencyType": "IMPORT_RESOURCE"
                    }
                  ],
                  "scope": "SOURCE"
                },
                {
                  "name": "src/main/resources/META-INF/f.xml",
                  "type": "XML",
                  "dependencies": [],
                  "scope": "SOURCE"
                },
                {
                  "name": "src/main/resources/META-INF/b.xml",
                  "type": "XML",
                  "dependencies": [
                    {
                      "modelName": "com.intellij.treeConfigs.anno.ConfigE",
                      "dependencyType": "COMPONENT_SCAN"
                    },
                    {
                      "modelName": "com.intellij.treeConfigs.anno.ConfigC",
                      "dependencyType": "COMPONENT_SCAN"
                    }
                  ],
                  "scope": "SOURCE"
                },
                {
                  "name": "com.intellij.treeConfigs.anno.ConfigE",
                  "type": "ANNO",
                  "dependencies": [
                    {
                      "modelName": "com.intellij.treeConfigs.anno2.ConfigG.G1",
                      "dependencyType": "IMPORT_ANNO"
                    },
                    {
                      "modelName": "com.intellij.treeConfigs.anno2.ConfigG.G2",
                      "dependencyType": "IMPORT_ANNO"
                    }
                  ],
                  "scope": "SOURCE"
                },
                {
                  "name": "com.intellij.treeConfigs.anno2.ConfigG.G1",
                  "type": "ANNO",
                  "dependencies": [],
                  "scope": "SOURCE"
                },
                {
                  "name": "com.intellij.treeConfigs.anno2.ConfigG.G2",
                  "type": "ANNO",
                  "dependencies": [],
                  "scope": "SOURCE"
                },
                {
                  "name": "com.intellij.treeConfigs.anno.ConfigC",
                  "type": "ANNO",
                  "dependencies": [
                    {
                      "modelName": "src/main/resources/META-INF/d.xml",
                      "dependencyType": "IMPORT_RESOURCE"
                    }
                  ],
                  "scope": "SOURCE"
                },
                {
                  "name": "src/main/resources/META-INF/d.xml",
                  "type": "XML",
                  "dependencies": [],
                  "scope": "SOURCE"
                }
              ],
              "activeProfiles": [],
              "dependencyFileSets": [],
              "propertiesFiles": [
                "my.properties"
              ],
              "autodetected": false,
              "removed": false
            }
          ]
        }
      ]
    }
  ]
}
 */