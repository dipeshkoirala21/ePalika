package com.dipes.epalika;

class CardName {
    private String featureName;
    private int featureImage;

    CardName(String name, int image) {
        this.featureName = name;
        this.featureImage = image;
    }

    String getFeatureName() {
        return featureName;
    }

    int getFeatureImage() {
        return featureImage;
    }
}
