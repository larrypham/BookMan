package com.techiedb.app.bookman.activities;

import android.os.Bundle;

import com.techiedb.app.bookman.utils.LogUtils;

/**
 * Copyright (C) 2014 Techie Digital Benchwork Inc. All rights reserved. Mobile UX Promotion Division. This software and its documentation
 * are confidential and proprietary information of Techie Digital Benchwork Inc.  No part of the software and documents may be copied,
 * reproduced, transmitted, translated, or reduced to any electronic medium or machine-readable form without the prior written consent of
 * Techie Digital Benchwork. Techie Digital Benchwork makes no representations with respect to the contents, and assumes no responsibility
 * for any errors that might appear in the software and documents. This publication and the contents hereof are subject to change without
 * notice. History
 *
 * @author Larry Pham
 * @project BookMan
 * @since Dec.19.2014
 */
public class BookGalleryActivity extends BaseActivity {
  public static final String TAG = LogUtils.makeLogTag(BookGalleryActivity.class);

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Override
  protected int getSelfNavDrawerItem() {
    return NAVDRAWER_ITEM_BOOK_COLLECTIONS;
  }

  @Override
  public void invalidate() {

  }

  @Override
  public void invalidate(Object param) {

  }
}
