package com.lmhscodingclub.newscompass;

enum PoliticalBias {
    LEFT, CENTER, RIGHT
}

record NewsSource(PoliticalBias leaning, String name) {

}
