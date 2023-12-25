package api

object Events {
    const val messageNew = "message_new"
    const val messageReply = "message_reply"
    const val messageEdit = "message_edit"
    const val messageAllow = "message_allow"
    const val messageDeny = "message_deny"
    const val messageTypingState = "message_typing_state"
    const val messageEvent = "message_event"

    const val photoNew = "photo_new"
    const val photoCommentNew = "photo_comment_new"
    const val photoCommentEdit = "photo_comment_edit"
    const val photoCommentRestore = "photo_comment_restore"
    const val photoCommentDelete = "photo_comment_delete"

    const val audioNew = "audio_new"

    const val videoNew = "video_new"
    const val videoCommentNew = "video_comment_new"
    const val videoCommentEdit = "video_comment_edit"
    const val videoCommentRestore = "video_comment_restore"
    const val videoCommentDelete = "video_comment_delete"

    const val wallPostNew = "wall_post_new"
    const val wallRepost = "wall_repost"
    const val wallReplyNew = "wall_reply_new"
    const val wallReplyEdit = "wall_reply_edit"
    const val wallReplyRestore = "wall_reply_restore"
    const val wallReplyDelete = "wall_reply_delete"

    const val likeAdd = "like_add"
    const val likeRemove = "like_remove"

    const val boardPostNew = "board_post_new"
    const val boardPostEdit = "board_post_edit"
    const val boardPostRestore = "board_post_restore"
    const val boardPostDelete = "board_post_delete"

    const val marketCommentNew = "market_comment_new"
    const val marketCommentEdit = "market_comment_edit"
    const val marketCommentRestore = "market_comment_restore"
    const val marketCommentDelete = "market_comment_delete"
    const val marketOrderNew = "market_order_new"
    const val marketOrderEdit = "market_order_edit"

    const val groupLeave = "group_leave"
    const val groupJoin = "group_join"

    const val userBlock = "user_block"
    const val userUnblock = "user_unblock"

    const val pollVoteNew = "poll_vote_new"

    const val groupOfficersEdit = "group_officers_edit"
    const val groupChangeSettings = "group_change_settings"
    const val groupChangePhoto = "group_change_photo"

    const val vkpayTransaction = "vkpay_transaction"

    const val appPayload = "app_payload"

    const val donutSubscriptionCreate = "donut_subscription_create"
    const val donutSubscriptionProlonged = "donut_subscription_prolonged"
    const val donutSubscriptionExpired = "donut_subscription_expired"
    const val donutSubscriptionCancelled = "donut_subscription_cancelled"
    const val donutSubscriptionPriceChanged = "donut_subscription_price_changed"
    const val donutMoneyWithdraw = "donut_money_withdraw"
    const val donutMoneyWithdrawError = "donut_money_withdraw_error"
}