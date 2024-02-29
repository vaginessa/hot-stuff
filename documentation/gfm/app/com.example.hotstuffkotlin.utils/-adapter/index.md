//[app](../../../index.md)/[com.hotstuff.utils](../index.md)/[Adapter](index.md)

# Adapter

[androidJvm]\
class [Adapter](index.md)(items: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[Item](../../com.hotstuff.models/-item/index.md)&gt;) : [RecyclerView.Adapter](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.Adapter.html)&lt;[Adapter.ViewHolder](-view-holder/index.md)&gt;

## Constructors

| | |
|---|---|
| [Adapter](-adapter.md) | [androidJvm]<br>constructor(items: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[Item](../../com.hotstuff.models/-item/index.md)&gt;) |

## Types

| Name | Summary |
|---|---|
| [OnItemClickListener](-on-item-click-listener/index.md) | [androidJvm]<br>interface [OnItemClickListener](-on-item-click-listener/index.md) |
| [ViewHolder](-view-holder/index.md) | [androidJvm]<br>class [ViewHolder](-view-holder/index.md)(itemView: [View](https://developer.android.com/reference/kotlin/android/view/View.html), clickListener: [Adapter.OnItemClickListener](-on-item-click-listener/index.md)) : [RecyclerView.ViewHolder](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.ViewHolder.html) |

## Functions

| Name | Summary |
|---|---|
| [bindViewHolder](index.md#2074940904%2FFunctions%2F-912451524) | [androidJvm]<br>fun [bindViewHolder](index.md#2074940904%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [Adapter.ViewHolder](-view-holder/index.md), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [createViewHolder](../-onboard-adapter/index.md#1423244545%2FFunctions%2F-912451524) | [androidJvm]<br>@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)<br>fun [createViewHolder](../-onboard-adapter/index.md#1423244545%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [ViewGroup](https://developer.android.com/reference/kotlin/android/view/ViewGroup.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Adapter.ViewHolder](-view-holder/index.md) |
| [findRelativeAdapterPositionIn](../-onboard-adapter/index.md#-1238180073%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [findRelativeAdapterPositionIn](../-onboard-adapter/index.md#-1238180073%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [RecyclerView.Adapter](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.Adapter.html)&lt;out [RecyclerView.ViewHolder](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.ViewHolder.html)&gt;, @[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p1: [RecyclerView.ViewHolder](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.ViewHolder.html), p2: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getItemCount](get-item-count.md) | [androidJvm]<br>open override fun [getItemCount](get-item-count.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getItemId](index.md#725914875%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [getItemId](index.md#725914875%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [getItemViewType](../-onboard-adapter/index.md#714126295%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [getItemViewType](../-onboard-adapter/index.md#714126295%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [getStateRestorationPolicy](../-onboard-adapter/index.md#1717359980%2FFunctions%2F-912451524) | [androidJvm]<br>@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)<br>fun [getStateRestorationPolicy](../-onboard-adapter/index.md#1717359980%2FFunctions%2F-912451524)(): [RecyclerView.Adapter.StateRestorationPolicy](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.Adapter.StateRestorationPolicy.html) |
| [hasObservers](../-onboard-adapter/index.md#1092162006%2FFunctions%2F-912451524) | [androidJvm]<br>fun [hasObservers](../-onboard-adapter/index.md#1092162006%2FFunctions%2F-912451524)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hasStableIds](../-onboard-adapter/index.md#16685238%2FFunctions%2F-912451524) | [androidJvm]<br>fun [hasStableIds](../-onboard-adapter/index.md#16685238%2FFunctions%2F-912451524)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [notifyDataSetChanged](../-onboard-adapter/index.md#-1095556076%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyDataSetChanged](../-onboard-adapter/index.md#-1095556076%2FFunctions%2F-912451524)() |
| [notifyItemChanged](../-onboard-adapter/index.md#-1721030169%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemChanged](../-onboard-adapter/index.md#-1721030169%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>fun [notifyItemChanged](../-onboard-adapter/index.md#748267402%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), @[Nullable](https://developer.android.com/reference/kotlin/androidx/annotation/Nullable.html)p1: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?) |
| [notifyItemInserted](../-onboard-adapter/index.md#2137269507%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemInserted](../-onboard-adapter/index.md#2137269507%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [notifyItemMoved](../-onboard-adapter/index.md#-1694317867%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemMoved](../-onboard-adapter/index.md#-1694317867%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [notifyItemRangeChanged](../-onboard-adapter/index.md#1769183193%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemRangeChanged](../-onboard-adapter/index.md#1769183193%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))<br>fun [notifyItemRangeChanged](../-onboard-adapter/index.md#1916975740%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), @[Nullable](https://developer.android.com/reference/kotlin/androidx/annotation/Nullable.html)p2: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?) |
| [notifyItemRangeInserted](../-onboard-adapter/index.md#-2104748521%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemRangeInserted](../-onboard-adapter/index.md#-2104748521%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [notifyItemRangeRemoved](../-onboard-adapter/index.md#999899269%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemRangeRemoved](../-onboard-adapter/index.md#999899269%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [notifyItemRemoved](../-onboard-adapter/index.md#-189254469%2FFunctions%2F-912451524) | [androidJvm]<br>fun [notifyItemRemoved](../-onboard-adapter/index.md#-189254469%2FFunctions%2F-912451524)(p0: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [onAttachedToRecyclerView](index.md#-1243461790%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onAttachedToRecyclerView](index.md#-1243461790%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [RecyclerView](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.html)) |
| [onBindViewHolder](index.md#-427309227%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onBindViewHolder](index.md#-427309227%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [Adapter.ViewHolder](-view-holder/index.md), p1: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), @[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p2: [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)&lt;[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;)<br>open override fun [onBindViewHolder](on-bind-view-holder.md)(holder: [Adapter.ViewHolder](-view-holder/index.md), position: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [onCreateViewHolder](on-create-view-holder.md) | [androidJvm]<br>open override fun [onCreateViewHolder](on-create-view-holder.md)(parent: [ViewGroup](https://developer.android.com/reference/kotlin/android/view/ViewGroup.html), viewType: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Adapter.ViewHolder](-view-holder/index.md) |
| [onDetachedFromRecyclerView](index.md#-1201433889%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onDetachedFromRecyclerView](index.md#-1201433889%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [RecyclerView](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.html)) |
| [onFailedToRecycleView](index.md#1098395520%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onFailedToRecycleView](index.md#1098395520%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [Adapter.ViewHolder](-view-holder/index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [onViewAttachedToWindow](index.md#1580844378%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onViewAttachedToWindow](index.md#1580844378%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [Adapter.ViewHolder](-view-holder/index.md)) |
| [onViewDetachedFromWindow](index.md#304950551%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onViewDetachedFromWindow](index.md#304950551%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [Adapter.ViewHolder](-view-holder/index.md)) |
| [onViewRecycled](index.md#280579708%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [onViewRecycled](index.md#280579708%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [Adapter.ViewHolder](-view-holder/index.md)) |
| [registerAdapterDataObserver](../-onboard-adapter/index.md#-149943229%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [registerAdapterDataObserver](../-onboard-adapter/index.md#-149943229%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [RecyclerView.AdapterDataObserver](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.AdapterDataObserver.html)) |
| [searchClear](search-clear.md) | [androidJvm]<br>fun [searchClear](search-clear.md)()<br>Clear the stored items array in the [Adapter](index.md) and notify [ViewHolder](-view-holder/index.md). |
| [searchInsert](search-insert.md) | [androidJvm]<br>fun [searchInsert](search-insert.md)(insertPosition: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), updatedItemsArray: [ArrayList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)&lt;[Item](../../com.hotstuff.models/-item/index.md)&gt;)<br>Insert search result to the stored items array in the [Adapter](index.md) and notify [ViewHolder](-view-holder/index.md). |
| [setHasStableIds](index.md#1991189249%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [setHasStableIds](index.md#1991189249%2FFunctions%2F-912451524)(p0: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |
| [setOnItemClickListener](set-on-item-click-listener.md) | [androidJvm]<br>fun [setOnItemClickListener](set-on-item-click-listener.md)(itemListener: [Adapter.OnItemClickListener](-on-item-click-listener/index.md)) |
| [setStateRestorationPolicy](../-onboard-adapter/index.md#1439711293%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [setStateRestorationPolicy](../-onboard-adapter/index.md#1439711293%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [RecyclerView.Adapter.StateRestorationPolicy](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.Adapter.StateRestorationPolicy.html)) |
| [unregisterAdapterDataObserver](../-onboard-adapter/index.md#607934410%2FFunctions%2F-912451524) | [androidJvm]<br>open fun [unregisterAdapterDataObserver](../-onboard-adapter/index.md#607934410%2FFunctions%2F-912451524)(@[NonNull](https://developer.android.com/reference/kotlin/androidx/annotation/NonNull.html)p0: [RecyclerView.AdapterDataObserver](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView.AdapterDataObserver.html)) |