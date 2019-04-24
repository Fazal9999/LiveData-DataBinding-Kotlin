package io.github.erikcaffrey.livebinding.view.images

import android.content.Context
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import io.github.erikcaffrey.livedata_databinding.R

class MarginDecoration(context: Context) : RecyclerView.ItemDecoration() {

    private var margin: Int = context.resources.getDimensionPixelSize(R.dimen.item_margin)

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        outRect.set(margin, margin, margin, margin)
    }
}