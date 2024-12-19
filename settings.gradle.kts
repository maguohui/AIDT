pluginManagement {
    repositories {
        maven { setUrl("https://maven.aliyun.com/repository/public")  }
        maven { setUrl("https://maven.aliyun.com/repository/central")  }
        maven { setUrl("https://maven.aliyun.com/repository/jcenter")  }
        maven { setUrl("https://maven.aliyun.com/repository/google")  }
        maven { setUrl("https://maven.aliyun.com/repository/gradle-plugin")  }
        maven { setUrl("https://maven.aliyun.com/repository/apache-snapshots")  }
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "AIDT"