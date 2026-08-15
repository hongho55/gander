package com.arjun.gander

import android.content.Context

/** The reader's persistent preference for opening PowerPoint files. */
object PptxOpening {
    private const val PREFS = "viewer_preferences"
    private const val KEY_EXTERNAL = "pptx_external"

    fun usesExternalApp(context: Context): Boolean =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getBoolean(KEY_EXTERNAL, false)

    fun setUsesExternalApp(context: Context, value: Boolean) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .edit()
            .putBoolean(KEY_EXTERNAL, value)
            .apply()
    }
}
