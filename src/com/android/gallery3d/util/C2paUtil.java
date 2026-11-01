/*
 * Copyright (c) 2024 Truepic
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
/*
 * Changes from Qualcomm Innovation Center, Inc. are provided under the following license:
 * Copyright (c) 2024-2025 Qualcomm Innovation Center, Inc. All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause-Clear
 */

package com.android.gallery3d.util;

import android.content.Context;

import com.truepic.lensverify.data.c2padata.C2PAData;

/**
 * Content credential (C2PA) checks for Gallery.
 *
 * Validation runs through Qualcomm's vendor.qti.hardware.c2pa HAL, whose
 * interface definitions are not part of the open CLO sources, so the system
 * image cannot carry a client for it. Every item is reported as having no
 * content credentials; the rest of Gallery already handles that case.
 */
public class C2paUtil {
    private static final String TAG = "C2paUtil";

    private static Context mContext = null;
    private final String mFilePath;

    public C2paUtil(String filePath) {
        mFilePath = filePath;
    }

    public enum C2PAStatus {
        NON_C2PA,
        C2PA,
        C2PA_INVALID_HASH,
        C2PA_INVALID_SIGNATURE
    }

    public static void connectC2PAService() {
    }

    public String getValidateResult() {
        return null;
    }

    public void validateImage() {
    }

    public C2PAData getImageC2paData() {
        return null;
    }

    public C2PAStatus getC2PAStatus() {
        return C2PAStatus.NON_C2PA;
    }

    public static void setContext(Context context) {
        mContext = context;
    }

    public static boolean isC2paEnabled() {
        return false;
    }
}
