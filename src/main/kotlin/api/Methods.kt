package api

object Methods {
    object Account {
        const val ban = "account.ban"
        const val changePassword = "account.changePassword"
        const val getActiveOffers = "account.getActiveOffers"
        const val getAppPermissions = "account.getAppPermissions"
        const val getBanned = "account.getBanned"
        const val getCounters = "account.getCounters"
        const val getInfo = "account.getInfo"
        const val getProfileInfo = "account.getProfileInfo"
        const val getPushSettings = "account.getPushSettings"
        const val lookupContacts = "account.lookupContacts"
        const val registerDevice = "account.registerDevice"
        const val saveProfileInfo = "account.saveProfileInfo"
        const val setInfo = "account.setInfo"
        const val setNameInMenu = "account.setNameInMenu"
        const val setOffline = "account.setOffline"
        const val setOnline = "account.setOnline"
        const val setPushSettings = "account.setPushSettings"
        const val setSilenceMode = "account.setSilenceMode"
        const val unban = "account.unban"
        const val unregisterDevice = "account.unregisterDevice"
    }

    object Ads {
        const val addOfficeUsers = "ads.addOfficeUsers"
        const val checkLink = "ads.checkLink"
        const val createAds = "ads.createAds"
        const val createCampaigns = "ads.createCampaigns"
        const val createClients = "ads.createClients"
        const val createLookalikeRequest = "ads.createLookalikeRequest"
        const val createTargetGroup = "ads.createTargetGroup"
        const val createTargetPixel = "ads.createTargetPixel"
        const val deleteAds = "ads.deleteAds"
        const val deleteCampaigns = "ads.deleteCampaigns"
        const val deleteClients = "ads.deleteClients"
        const val deleteTargetGroup = "ads.deleteTargetGroup"
        const val deleteTargetPixel = "ads.deleteTargetPixel"
        const val getAccounts = "ads.getAccounts"
        const val getAds = "ads.getAds"
        const val getAdsLayout = "ads.getAdsLayout"
        const val getAdsPostsReach = "ads.getAdsPostsReach"
        const val getAdsTargeting = "ads.getAdsTargeting"
        const val getBudget = "ads.getBudget"
        const val getCampaigns = "ads.getCampaigns"
        const val getCategories = "ads.getCategories"
        const val getClients = "ads.getClients"
        const val getDemographics = "ads.getDemographics"
        const val getFloodStats = "ads.getFloodStats"
        const val getLookalikeRequests = "ads.getLookalikeRequests"
        const val getMusicians = "ads.getMusicians"
        const val getMusiciansByIds = "ads.getMusiciansByIds"
        const val getOfficeUsers = "ads.getOfficeUsers"
        const val getPostsReach = "ads.getPostsReach"
        const val getRejectionReason = "ads.getRejectionReason"
        const val getStatistics = "ads.getStatistics"
        const val getSuggestions = "ads.getSuggestions"
        const val getTargetGroups = "ads.getTargetGroups"
        const val getTargetPixels = "ads.getTargetPixels"
        const val getTargetingStats = "ads.getTargetingStats"
        const val getUploadURL = "ads.getUploadURL"
        const val getVideoUploadURL = "ads.getVideoUploadURL"
        const val importTargetContacts = "ads.importTargetContacts"
        const val removeOfficeUsers = "ads.removeOfficeUsers"
        const val removeTargetContacts = "ads.removeTargetContacts"
        const val saveLookalikeRequestResult = "ads.saveLookalikeRequestResult"
        const val shareTargetGroup = "ads.shareTargetGroup"
        const val updateAds = "ads.updateAds"
        const val updateCampaigns = "ads.updateCampaigns"
        const val updateClients = "ads.updateClients"
        const val updateOfficeUsers = "ads.updateOfficeUsers"
        const val updateTargetGroup = "ads.updateTargetGroup"
        const val updateTargetPixel = "ads.updateTargetPixel"
    }

    object AppWidgets {
        const val getAppImageUploadServer = "appWidgets.getAppImageUploadServer"
        const val getAppImages = "appWidgets.getAppImages"
        const val getGroupImageUploadServer = "appWidgets.getGroupImageUploadServer"
        const val getGroupImages = "appWidgets.getGroupImages"
        const val getImagesById = "appWidgets.getImagesById"
        const val saveAppImage = "appWidgets.saveAppImage"
        const val saveGroupImage = "appWidgets.saveGroupImage"
        const val update = "appWidgets.update"
    }

    object Apps {
        const val addSnippet = "apps.addSnippet"
        const val addUsersToTestingGroup = "apps.addUsersToTestingGroup"
        const val deleteAppRequests = "apps.deleteAppRequests"
        const val deleteSnippet = "apps.deleteSnippet"
        const val getApps = "apps.get"
        const val getCatalog = "apps.getCatalog"
        const val getFriendsList = "apps.getFriendsList"
        const val getLastUploadedVersion = "apps.getLastUploadedVersion"
        const val getLeaderboard = "apps.getLeaderboard"
        const val getMiniAppPolicies = "apps.getMiniAppPolicies"
        const val getScopes = "apps.getScopes"
        const val getScore = "apps.getScore"
        const val getSnippets = "apps.getSnippets"
        const val getTestingGroups = "apps.getTestingGroups"
        const val isNotificationsAllowed = "apps.isNotificationsAllowed"
        const val promoHasActiveGift = "apps.promoHasActiveGift"
        const val promoUseGift = "apps.promoUseGift"
        const val removeTestingGroup = "apps.removeTestingGroup"
        const val removeUsersFromTestingGroups = "apps.removeUsersFromTestingGroups"
        const val sendRequest = "apps.sendRequest"
        const val updateMetaForTestingGroups = "apps.updateMetaForTestingGroups"
    }

    object Asr {
        const val checkStatus = "asr.checkStatus"
        const val getUploadUrl = "asr.getUploadUrl"
        const val process = "asr.process"
    }

    object Auth {
        const val checkPhone = "auth.checkPhone"
        const val restore = "auth.restore"
    }

    object Board {
        const val addTopic = "board.addTopic"
        const val closeTopic = "board.closeTopic"
        const val createComment = "board.createComment"
        const val deleteComment = "board.deleteComment"
        const val deleteTopic = "board.deleteTopic"
        const val editComment = "board.editComment"
        const val editTopic = "board.editTopic"
        const val fixTopic = "board.fixTopic"
        const val getComments = "board.getComments"
        const val getTopics = "board.getTopics"
        const val openTopic = "board.openTopic"
        const val restoreComment = "board.restoreComment"
        const val unfixTopic = "board.unfixTopic"
    }

    object Bugtracker {
        const val addCompanyGroupsMembers = "bugtracker.addCompanyGroupsMembers"
        const val addCompanyMembers = "bugtracker.addCompanyMembers"
        const val changeBugreportStatus = "bugtracker.changeBugreportStatus"
        const val createComment = "bugtracker.createComment"
        const val getBugreportById = "bugtracker.getBugreportById"
        const val getCompanyGroupMembers = "bugtracker.getCompanyGroupMembers"
        const val getCompanyMembers = "bugtracker.getCompanyMembers"
        const val getDownloadVersionUrl = "bugtracker.getDownloadVersionUrl"
        const val getProductBuildUploadServer = "bugtracker.getProductBuildUploadServer"
        const val removeCompanyGroupMember = "bugtracker.removeCompanyGroupMember"
        const val removeCompanyMember = "bugtracker.removeCompanyMember"
        const val saveProductVersion = "bugtracker.saveProductVersion"
        const val setCompanyMemberRole = "bugtracker.setCompanyMemberRole"
        const val setProductIsOver = "bugtracker.setProductIsOver"
    }

    object Calls {
        const val forceFinish = "calls.forceFinish"
        const val start = "calls.start"
    }

    object Database {
        const val getChairs = "database.getChairs"
        const val getCities = "database.getCities"
        const val getCitiesById = "database.getCitiesById"
        const val getCountries = "database.getCountries"
        const val getCountriesById = "database.getCountriesById"
        const val getFaculties = "database.getFaculties"
        const val getMetroStations = "database.getMetroStations"
        const val getMetroStationsById = "database.getMetroStationsById"
        const val getRegions = "database.getRegions"
        const val getSchoolClasses = "database.getSchoolClasses"
        const val getSchools = "database.getSchools"
        const val getUniversities = "database.getUniversities"
    }

    object Docs {
        const val add = "docs.add"
        const val delete = "docs.delete"
        const val edit = "docs.edit"
        const val getDocs = "docs.get"
        const val getById = "docs.getById"
        const val getMessagesUploadServer = "docs.getMessagesUploadServer"
        const val getTypes = "docs.getTypes"
        const val getUploadServer = "docs.getUploadServer"
        const val getWallUploadServer = "docs.getWallUploadServer"
        const val save = "docs.save"
        const val search = "docs.search"
    }

    object Donut {
        const val getFriends = "donut.getFriends"
        const val getSubscription = "donut.getSubscription"
        const val getSubscriptions = "donut.getSubscriptions"
        const val isDon = "donut.isDon"
    }

    object DownloadedGames {
        const val getPaidStatus = "downloadedGames.getPaidStatus"
    }

    object Fave {
        const val addArticle = "fave.addArticle"
        const val addLink = "fave.addLink"
        const val addPage = "fave.addPage"
        const val addPost = "fave.addPost"
        const val addProduct = "fave.addProduct"
        const val addTag = "fave.addTag"
        const val addVideo = "fave.addVideo"
        const val editTag = "fave.editTag"
        const val getFave = "fave.get"
        const val getPages = "fave.getPages"
        const val getTags = "fave.getTags"
        const val markSeen = "fave.markSeen"
        const val removeArticle = "fave.removeArticle"
        const val removeLink = "fave.removeLink"
        const val removePage = "fave.removePage"
        const val removePost = "fave.removePost"
        const val removeProduct = "fave.removeProduct"
        const val removeTag = "fave.removeTag"
        const val removeVideo = "fave.removeVideo"
        const val reorderTags = "fave.reorderTags"
        const val setPageTags = "fave.setPageTags"
        const val setTags = "fave.setTags"
        const val trackPageInteraction = "fave.trackPageInteraction"
    }

    object Friends {
        const val add = "friends.add"
        const val addList = "friends.addList"
        const val areFriends = "friends.areFriends"
        const val delete = "friends.delete"
        const val deleteAllRequests = "friends.deleteAllRequests"
        const val deleteList = "friends.deleteList"
        const val edit = "friends.edit"
        const val editList = "friends.editList"
        const val getFriends = "friends.get"
        const val getAppUsers = "friends.getAppUsers"
        const val getAvailableForCall = "friends.getAvailableForCall"
        const val getByPhones = "friends.getByPhones"
        const val getLists = "friends.getLists"
        const val getMutual = "friends.getMutual"
        const val getOnline = "friends.getOnline"
        const val getRecent = "friends.getRecent"
        const val getRequests = "friends.getRequests"
        const val getSuggestions = "friends.getSuggestions"
        const val search = "friends.search"
    }

    object Gifts {
        const val getGifts = "gifts.get"
    }

    object Groups {
        const val addAddress = "groups.addAddress"
        const val addCallbackServer = "groups.addCallbackServer"
        const val addLink = "groups.addLink"
        const val approveRequest = "groups.approveRequest"
        const val ban = "groups.ban"
        const val create = "groups.create"
        const val deleteAddress = "groups.deleteAddress"
        const val deleteCallbackServer = "groups.deleteCallbackServer"
        const val deleteLink = "groups.deleteLink"
        const val disableOnline = "groups.disableOnline"
        const val edit = "groups.edit"
        const val editAddress = "groups.editAddress"
        const val editCallbackServer = "groups.editCallbackServer"
        const val editLink = "groups.editLink"
        const val editManager = "groups.editManager"
        const val editPlace = "groups.editPlace"
        const val enableOnline = "groups.enableOnline"
        const val getGroups = "groups.get"
        const val getAddresses = "groups.getAddresses"
        const val getBanned = "groups.getBanned"
        const val getById = "groups.getById"
        const val getCallbackConfirmationCode = "groups.getCallbackConfirmationCode"
        const val getCallbackServerSettings = "groups.getCallbackServerSettings"
        const val getCallbackServers = "groups.getCallbackServers"
        const val getCallbackSettings = "groups.getCallbackSettings"
        const val getCatalog = "groups.getCatalog"
        const val getCatalogInfo = "groups.getCatalogInfo"
        const val getInvitedUsers = "groups.getInvitedUsers"
        const val getInvites = "groups.getInvites"
        const val getLongPollServer = "groups.getLongPollServer"
        const val getLongPollSettings = "groups.getLongPollSettings"
        const val getMembers = "groups.getMembers"
        const val getOnlineStatus = "groups.getOnlineStatus"
        const val getRequests = "groups.getRequests"
        const val getSettings = "groups.getSettings"
        const val getTagList = "groups.getTagList"
        const val getTokenPermissions = "groups.getTokenPermissions"
        const val invite = "groups.invite"
        const val isMember = "groups.isMember"
        const val join = "groups.join"
        const val leave = "groups.leave"
        const val removeUser = "groups.removeUser"
        const val reorderLink = "groups.reorderLink"
        const val search = "groups.search"
        const val setCallbackSettings = "groups.setCallbackSettings"
        const val setLongPollSettings = "groups.setLongPollSettings"
        const val setSettings = "groups.setSettings"
        const val setUserNote = "groups.setUserNote"
        const val tagAdd = "groups.tagAdd"
        const val tagBind = "groups.tagBind"
        const val tagDelete = "groups.tagDelete"
        const val tagUpdate = "groups.tagUpdate"
        const val toggleMarket = "groups.toggleMarket"
        const val unban = "groups.unban"
    }

    object LeadForms {
        const val create = "leadForms.create"
        const val delete = "leadForms.delete"
        const val getLF = "leadForms.get"
        const val getLeads = "leadForms.getLeads"
        const val getUploadURL = "leadForms.getUploadURL"
        const val list = "leadForms.list"
        const val update = "leadForms.update"
    }

    object Likes {
        const val add = "likes.add"
        const val delete = "likes.delete"
        const val getList = "likes.getList"
        const val isLiked = "likes.isLiked"
    }

    object Market {
        const val add = "market.add"
        const val addAlbum = "market.addAlbum"
        const val addProperty = "market.addProperty"
        const val addPropertyVariant = "market.addPropertyVariant"
        const val addToAlbum = "market.addToAlbum"
        const val createComment = "market.createComment"
        const val delete = "market.delete"
        const val deleteAlbum = "market.deleteAlbum"
        const val deleteComment = "market.deleteComment"
        const val deleteProperty = "market.deleteProperty"
        const val deletePropertyVariant = "market.deletePropertyVariant"
        const val edit = "market.edit"
        const val editAlbum = "market.editAlbum"
        const val editComment = "market.editComment"
        const val editOrder = "market.editOrder"
        const val editProperty = "market.editProperty"
        const val editPropertyVariant = "market.editPropertyVariant"
        const val filterCategories = "market.filterCategories"
        const val getMarket = "market.get"
        const val getAlbumById = "market.getAlbumById"
        const val getAlbums = "market.getAlbums"
        const val getById = "market.getById"
        const val getCategories = "market.getCategories"
        const val getComments = "market.getComments"
        const val getGroupOrders = "market.getGroupOrders"
        const val getOrderById = "market.getOrderById"
        const val getOrderItems = "market.getOrderItems"
        const val getOrders = "market.getOrders"
        const val getProductPhotoUploadServer = "market.getProductPhotoUploadServer"
        const val getProperties = "market.getProperties"
        const val groupItems = "market.groupItems"
        const val removeFromAlbum = "market.removeFromAlbum"
        const val reorderAlbums = "market.reorderAlbums"
        const val reorderItems = "market.reorderItems"
        const val report = "market.report"
        const val reportComment = "market.reportComment"
        const val restore = "market.restore"
        const val restoreComment = "market.restoreComment"
        const val saveProductPhoto = "market.saveProductPhoto"
        const val search = "market.search"
        const val searchItems = "market.searchItems"
        const val searchItemsBasic = "market.searchItemsBasic"
        const val ungroupItems = "market.ungroupItems"
    }

    object Messages {
        const val addChatUser = "messages.addChatUser"
        const val allowMessagesFromGroup = "messages.allowMessagesFromGroup"
        const val createChat = "messages.createChat"
        const val delete = "messages.delete"
        const val deleteChatPhoto = "messages.deleteChatPhoto"
        const val deleteConversation = "messages.deleteConversation"
        const val deleteReaction = "messages.deleteReaction"
        const val denyMessagesFromGroup = "messages.denyMessagesFromGroup"
        const val edit = "messages.edit"
        const val editChat = "messages.editChat"
        const val forceCallFinish = "messages.forceCallFinish"
        const val getMsg = "messages.get"
        const val getByConversationMessageId = "messages.getByConversationMessageId"
        const val getById = "messages.getById"
        const val getChat = "messages.getChat"
        const val getChatPreview = "messages.getChatPreview"
        const val getChatUsers = "messages.getChatUsers"
        const val getConversationMembers = "messages.getConversationMembers"
        const val getConversations = "messages.getConversations"
        const val getConversationsById = "messages.getConversationsById"
        const val getDialogs = "messages.getDialogs"
        const val getHistory = "messages.getHistory"
        const val getHistoryAttachments = "messages.getHistoryAttachments"
        const val getImportantMessages = "messages.getImportantMessages"
        const val getIntentUsers = "messages.getIntentUsers"
        const val getInviteLink = "messages.getInviteLink"
        const val getLastActivity = "messages.getLastActivity"
        const val getLongPollHistory = "messages.getLongPollHistory"
        const val getLongPollServer = "messages.getLongPollServer"
        const val getMessagesReactions = "messages.getMessagesReactions"
        const val getReactedPeers = "messages.getReactedPeers"
        const val getReactionsAssets = "messages.getReactionsAssets"
        const val isMessagesFromGroupAllowed = "messages.isMessagesFromGroupAllowed"
        const val joinChatByInviteLink = "messages.joinChatByInviteLink"
        const val markAsAnsweredConversation = "messages.markAsAnsweredConversation"
        const val markAsImportant = "messages.markAsImportant"
        const val markAsImportantConversation = "messages.markAsImportantConversation"
        const val markAsRead = "messages.markAsRead"
        const val pin = "messages.pin"
        const val removeChatUser = "messages.removeChatUser"
        const val restore = "messages.restore"
        const val search = "messages.search"
        const val searchConversations = "messages.searchConversations"
        const val searchDialogs = "messages.searchDialogs"
        const val send = "messages.send"
        const val sendMessageEventAnswer = "messages.sendMessageEventAnswer"
        const val sendReaction = "messages.sendReaction"
        const val setActivity = "messages.setActivity"
        const val setChatPhoto = "messages.setChatPhoto"
        const val startCall = "messages.startCall"
        const val unpin = "messages.unpin"
    }

    object Newsfeed {
        const val addBan = "newsfeed.addBan"
        const val deleteBan = "newsfeed.deleteBan"
        const val deleteList = "newsfeed.deleteList"
        const val getNewsfeed = "newsfeed.get"
        const val getBanned = "newsfeed.getBanned"
        const val getComments = "newsfeed.getComments"
        const val getLists = "newsfeed.getLists"
        const val getMentions = "newsfeed.getMentions"
        const val getRecommended = "newsfeed.getRecommended"
        const val getSuggestedSources = "newsfeed.getSuggestedSources"
        const val ignoreItem = "newsfeed.ignoreItem"
        const val saveList = "newsfeed.saveList"
        const val search = "newsfeed.search"
        const val unIgnoreItem = "newsfeed.unignoreItem"
        const val unsubscribe = "newsfeed.unsubscribe"
    }

    object Notes {
        const val add = "notes.add"
        const val createComment = "notes.createComment"
        const val delete = "notes.delete"
        const val deleteComment = "notes.deleteComment"
        const val edit = "notes.edit"
        const val editComment = "notes.editComment"
        const val getNotes = "notes.get"
        const val getById = "notes.getById"
        const val getComments = "notes.getComments"
        const val getFriendsNotes = "notes.getFriendsNotes"
        const val restoreComment = "notes.restoreComment"
    }

    object Notifications {
        const val getNotifications = "notifications.get"
        const val markAsViewed = "notifications.markAsViewed"
        const val sendMessage = "notifications.sendMessage"
    }

    object Orders {
        const val cancelSubscription = "orders.cancelSubscription"
        const val changeState = "orders.changeState"
        const val getOrders = "orders.get"
        const val getAmount = "orders.getAmount"
        const val getById = "orders.getById"
        const val getUserSubscriptionById = "orders.getUserSubscriptionById"
        const val getUserSubscriptions = "orders.getUserSubscriptions"
        const val updateSubscription = "orders.updateSubscription"
    }

    object Pages {
        const val clearCache = "pages.clearCache"
        const val getPages = "pages.get"
        const val getHistory = "pages.getHistory"
        const val getTitles = "pages.getTitles"
        const val getVersion = "pages.getVersion"
        const val parseWiki = "pages.parseWiki"
        const val save = "pages.save"
        const val saveAccess = "pages.saveAccess"
    }

    object Photos {
        const val confirmTag = "photos.confirmTag"
        const val copy = "photos.copy"
        const val createAlbum = "photos.createAlbum"
        const val createComment = "photos.createComment"
        const val delete = "photos.delete"
        const val deleteAlbum = "photos.deleteAlbum"
        const val deleteComment = "photos.deleteComment"
        const val edit = "photos.edit"
        const val editAlbum = "photos.editAlbum"
        const val editComment = "photos.editComment"
        const val getPhotos = "photos.get"
        const val getAlbums = "photos.getAlbums"
        const val getAlbumsCount = "photos.getAlbumsCount"
        const val getAll = "photos.getAll"
        const val getAllComments = "photos.getAllComments"
        const val getById = "photos.getById"
        const val getChatUploadServer = "photos.getChatUploadServer"
        const val getComments = "photos.getComments"
        const val getMailUploadServer = "photos.getMailUploadServer"
        const val getMarketAlbumUploadServer = "photos.getMarketAlbumUploadServer"
        const val getMarketUploadServer = "photos.getMarketUploadServer"
        const val getMessagesUploadServer = "photos.getMessagesUploadServer"
        const val getNewTags = "photos.getNewTags"
        const val getOwnerCoverPhotoUploadServer = "photos.getOwnerCoverPhotoUploadServer"
        const val getOwnerPhotoUploadServer = "photos.getOwnerPhotoUploadServer"
        const val getProfile = "photos.getProfile"
        const val getTags = "photos.getTags"
        const val getUploadServer = "photos.getUploadServer"
        const val getUserPhotos = "photos.getUserPhotos"
        const val getWallUploadServer = "photos.getWallUploadServer"
        const val makeCover = "photos.makeCover"
        const val move = "photos.move"
        const val putTag = "photos.putTag"
        const val removeTag = "photos.removeTag"
        const val reorderAlbums = "photos.reorderAlbums"
        const val reorderPhotos = "photos.reorderPhotos"
        const val report = "photos.report"
        const val reportComment = "photos.reportComment"
        const val restore = "photos.restore"
        const val restoreComment = "photos.restoreComment"
        const val save = "photos.save"
        const val saveMarketAlbumPhoto = "photos.saveMarketAlbumPhoto"
        const val saveMarketPhoto = "photos.saveMarketPhoto"
        const val saveMessagesPhoto = "photos.saveMessagesPhoto"
        const val saveOwnerCoverPhoto = "photos.saveOwnerCoverPhoto"
        const val saveOwnerPhoto = "photos.saveOwnerPhoto"
        const val saveWallPhoto = "photos.saveWallPhoto"
        const val search = "photos.search"
    }

    object Places {
        const val getCheckins = "places.getCheckins"
    }

    object Podcasts {
        const val searchPodcast = "podcasts.searchPodcast"
    }

    object Polls {
        const val addVote = "polls.addVote"
        const val create = "polls.create"
        const val deleteVote = "polls.deleteVote"
        const val edit = "polls.edit"
        const val getBackgrounds = "polls.getBackgrounds"
        const val getById = "polls.getById"
        const val getPhotoUploadServer = "polls.getPhotoUploadServer"
        const val getVoters = "polls.getVoters"
        const val savePhoto = "polls.savePhoto"
    }

    object PrettyCards {
        const val create = "prettyCards.create"
        const val delete = "prettyCards.delete"
        const val edit = "prettyCards.edit"
        const val getPrettyCards = "prettyCards.get"
        const val getById = "prettyCards.getById"
        const val getUploadURL = "prettyCards.getUploadURL"
    }

    object Search {
        const val getHints = "search.getHints"
    }

    object Secure {
        const val addAppEvent = "secure.addAppEvent"
        const val checkToken = "secure.checkToken"
        const val getAppBalance = "secure.getAppBalance"
        const val getSMSHistory = "secure.getSMSHistory"
        const val getTransactionsHistory = "secure.getTransactionsHistory"
        const val getUserLevel = "secure.getUserLevel"
        const val giveEventSticker = "secure.giveEventSticker"
        const val sendNotification = "secure.sendNotification"
        const val sendSMSNotification = "secure.sendSMSNotification"
        const val setCounter = "secure.setCounter"
        const val setUserLevel = "secure.setUserLevel"
    }

    object Stats {
        const val getStats = "stats.get"
        const val getPostReach = "stats.getPostReach"
        const val trackVisitor = "stats.trackVisitor"
    }

    object Status {
        const val getStatus = "status.get"
        const val setStatus = "status.set"
    }

    object Storage {
        const val getStorage = "storage.get"
        const val getKeys = "storage.getKeys"
        const val setStorage = "storage.set"
    }

    object Store {
        const val addStickersToFavorite = "store.addStickersToFavorite"
        const val getFavoriteStickers = "store.getFavoriteStickers"
        const val getProducts = "store.getProducts"
        const val getStickersKeywords = "store.getStickersKeywords"
        const val removeStickersFromFavorite = "store.removeStickersFromFavorite"
    }

    object Stories {
        const val banOwner = "stories.banOwner"
        const val delete = "stories.delete"
        const val getStories = "stories.get"
        const val getBanned = "stories.getBanned"
        const val getById = "stories.getById"
        const val getDetailedStats = "stories.getDetailedStats"
        const val getPhotoUploadServer = "stories.getPhotoUploadServer"
        const val getReplies = "stories.getReplies"
        const val getStats = "stories.getStats"
        const val getVideoUploadServer = "stories.getVideoUploadServer"
        const val getViewers = "stories.getViewers"
        const val hideAllReplies = "stories.hideAllReplies"
        const val hideReply = "stories.hideReply"
        const val save = "stories.save"
        const val search = "stories.search"
        const val sendInteraction = "stories.sendInteraction"
        const val unbanOwner = "stories.unbanOwner"
    }

    object Streaming {
        const val getServerUrl = "streaming.getServerUrl"
        const val getSettings = "streaming.getSettings"
        const val getStats = "streaming.getStats"
        const val getStem = "streaming.getStem"
        const val setSettings = "streaming.setSettings"
    }

    object Translations {
        const val translate = "translations.translate"
    }

    object Users {
        const val getUsers = "users.get"
        const val getFollowers = "users.getFollowers"
        const val getSubscriptions = "users.getSubscriptions"
        const val report = "users.report"
        const val search = "users.search"
    }

    object Utils {
        const val checkLink = "utils.checkLink"
        const val deleteFromLastShortened = "utils.deleteFromLastShortened"
        const val getLastShortenedLinks = "utils.getLastShortenedLinks"
        const val getLinkStats = "utils.getLinkStats"
        const val getServerTime = "utils.getServerTime"
        const val getShortLink = "utils.getShortLink"
        const val resolveScreenName = "utils.resolveScreenName"
    }

    object Video {
        const val add = "video.add"
        const val addAlbum = "video.addAlbum"
        const val addToAlbum = "video.addToAlbum"
        const val createComment = "video.createComment"
        const val delete = "video.delete"
        const val deleteAlbum = "video.deleteAlbum"
        const val deleteComment = "video.deleteComment"
        const val edit = "video.edit"
        const val editAlbum = "video.editAlbum"
        const val editComment = "video.editComment"
        const val getVideo = "video.get"
        const val getAlbumById = "video.getAlbumById"
        const val getAlbums = "video.getAlbums"
        const val getAlbumsByVideo = "video.getAlbumsByVideo"
        const val getComments = "video.getComments"
        const val getLongPollServer = "video.getLongPollServer"
        const val getNewTags = "video.getNewTags"
        const val getTags = "video.getTags"
        const val liveGetCategories = "video.liveGetCategories"
        const val moveToAlbum = "video.moveToAlbum"
        const val putTag = "video.putTag"
        const val removeFromAlbum = "video.removeFromAlbum"
        const val removeTag = "video.removeTag"
        const val reorderAlbums = "video.reorderAlbums"
        const val reorderVideos = "video.reorderVideos"
        const val report = "video.report"
        const val reportComment = "video.reportComment"
        const val restore = "video.restore"
        const val restoreComment = "video.restoreComment"
        const val save = "video.save"
        const val search = "video.search"
        const val startStreaming = "video.startStreaming"
        const val stopStreaming = "video.stopStreaming"
    }

    object Wall {
        const val addLike = "wall.addLike"
        const val checkCopyrightLink = "wall.checkCopyrightLink"
        const val closeComments = "wall.closeComments"
        const val createComment = "wall.createComment"
        const val delete = "wall.delete"
        const val deleteComment = "wall.deleteComment"
        const val deleteLike = "wall.deleteLike"
        const val edit = "wall.edit"
        const val editAdsStealth = "wall.editAdsStealth"
        const val editComment = "wall.editComment"
        const val getWall = "wall.get"
        const val getById = "wall.getById"
        const val getComment = "wall.getComment"
        const val getComments = "wall.getComments"
        const val getLikes = "wall.getLikes"
        const val getPhotoUploadServer = "wall.getPhotoUploadServer"
        const val getReposts = "wall.getReposts"
        const val openComments = "wall.openComments"
        const val parseAttachedLink = "wall.parseAttachedLink"
        const val pin = "wall.pin"
        const val post = "wall.post"
        const val postAdsStealth = "wall.postAdsStealth"
        const val reportComment = "wall.reportComment"
        const val reportPost = "wall.reportPost"
        const val repost = "wall.repost"
        const val restore = "wall.restore"
        const val restoreComment = "wall.restoreComment"
        const val search = "wall.search"
        const val unpin = "wall.unpin"
    }

    object Widgets {
        const val getComments = "widgets.getComments"
        const val getPages = "widgets.getPages"
    }
}