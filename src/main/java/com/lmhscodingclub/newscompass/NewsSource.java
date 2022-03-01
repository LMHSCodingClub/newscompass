package com.lmhscodingclub.newscompass;

enum PoliticalBias {
    LEFT, CENTER, RIGHT
}

/**
 * Value object for metadata on a news source
 */
record NewsSource(PoliticalBias leaning, String name) {

}
