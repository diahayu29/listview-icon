package com.example.listviewicon.modul

import com.example.listviewicon.R


object Icon_Data {
        private val iconName = arrayOf(
            "Ruby",
            "Rails",
            "Python",
            "Java Script",
            "PHP"
        )
    private val detail = arrayOf(
        "Ruby adalah bahasa pemrograman dinamis berbasis skrip yang berorientasi objek.",
        "Rails, adalah sebuah kerangka kerja aplikasi web sumber terbuka yang berjalan via bahasa pemrograman Ruby.",
        "Python adalah bahasa pemrograman interpretatif multiguna dengan filosofi perancangan yang berfokus pada tingkat keterbacaan kode",
        "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis.",
        "Hypertext Preprocessor adalah bahasa skrip yang dapat ditanamkan atau disisipkan ke dalam HTML."
    )
    private val iconPoster = intArrayOf(
        R.drawable.icon1,
        R.drawable.icon2,
        R.drawable.icon3,
        R.drawable.icon4,
        R.drawable.icon5
    )
    val listicon: ArrayList<Icon>
        get() {
            val list = arrayListOf<Icon>()
            for (position in iconName.indices) {
                val icon = Icon()
                icon.name = iconName[position]
                icon.detail = detail[position]
                icon.poster = iconPoster[position]
                list.add(icon)
            }
            return list
        }
}