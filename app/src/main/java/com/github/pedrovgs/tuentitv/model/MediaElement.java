package com.github.pedrovgs.tuentitv.model;

/**
 * @author Pedro Vicente Gómez Sánchez.
 */
public class MediaElement implements ImageInfo {

  private final String title;
  private final String imageUrl;

  public MediaElement(String title, String imageUrl) {
    this.title = title;
    this.imageUrl = imageUrl;
  }

  @Override public String getImageUrl() {
    return imageUrl;
  }
}