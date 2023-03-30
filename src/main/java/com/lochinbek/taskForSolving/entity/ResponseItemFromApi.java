package com.lochinbek.taskForSolving.entity;

import java.io.Serializable;
import java.util.List;

public class ResponseItemFromApi  {

    private Boolean allowForking;
    private Integer stargazersCount;
    private Boolean isTemplate;
    private String pushedAt;
    private String subscriptionUrl;
    private String language;
    private String branchesUrl;
    private String issueCommentUrl;
    private String labelsUrl;
    private String subscribersUrl;
    private String releasesUrl;
    private String svnUrl;
    private Integer id;
    private Boolean hasDiscussions;
    private Integer forks;
    private String archiveUrl;
    private String gitRefsUrl;
    private String forksUrl;
    private String visibility;
    private String statusesUrl;
    private String sshUrl;
    private Object license;
    private String fullName;
    private Integer size;
    private String languagesUrl;
    private String htmlUrl;
    private String collaboratorsUrl;
    private String cloneUrl;
    private String name;
    private String pullsUrl;
    private String defaultBranch;
    private String hooksUrl;
    private String treesUrl;
    private String tagsUrl;
    private Boolean jsonMemberPrivate;
    private String contributorsUrl;
    private Boolean hasDownloads;
    private String notificationsUrl;
    private Integer openIssuesCount;
    private String description;
    private String createdAt;
    private Integer watchers;
    private String keysUrl;
    private String deploymentsUrl;
    private Boolean hasProjects;
    private Boolean archived;
    private Boolean hasWiki;
    private String updatedAt;
    private String commentsUrl;
    private String stargazersUrl;
    private Boolean disabled;
    private String gitUrl;
    private Boolean hasPages;
    private String commitsUrl;
    private String compareUrl;
    private String gitCommitsUrl;
    private List<Object> topics;
    private String blobsUrl;
    private String gitTagsUrl;
    private String mergesUrl;
    private String downloadsUrl;
    private Boolean hasIssues;
    private Boolean webCommitSignoffRequired;
    private String url;
    private String contentsUrl;
    private Object mirrorUrl;
    private String milestonesUrl;
    private String teamsUrl;
    private Boolean fork;
    private String issuesUrl;
    private String eventsUrl;
    private String issueEventsUrl;
    private String assigneesUrl;
    private Integer openIssues;
    private Integer watchersCount;
    private String nodeId;
    private Object homepage;
    private Integer forksCount;


    public ResponseItemFromApi() {
    }

    public ResponseItemFromApi(Boolean allowForking, Integer stargazersCount, Boolean isTemplate, String pushedAt, String subscriptionUrl, String language, String branchesUrl, String issueCommentUrl, String labelsUrl, String subscribersUrl, String releasesUrl, String svnUrl, Integer id, Boolean hasDiscussions, Integer forks, String archiveUrl, String gitRefsUrl, String forksUrl, String visibility, String statusesUrl, String sshUrl, Object license, String fullName, Integer size, String languagesUrl, String htmlUrl, String collaboratorsUrl, String cloneUrl, String name, String pullsUrl, String defaultBranch, String hooksUrl, String treesUrl, String tagsUrl, Boolean jsonMemberPrivate, String contributorsUrl, Boolean hasDownloads, String notificationsUrl, Integer openIssuesCount, String description, String createdAt, Integer watchers, String keysUrl, String deploymentsUrl, Boolean hasProjects, Boolean archived, Boolean hasWiki, String updatedAt, String commentsUrl, String stargazersUrl, Boolean disabled, String gitUrl, Boolean hasPages, String commitsUrl, String compareUrl, String gitCommitsUrl, List<Object> topics, String blobsUrl, String gitTagsUrl, String mergesUrl, String downloadsUrl, Boolean hasIssues, Boolean webCommitSignoffRequired, String url, String contentsUrl, Object mirrorUrl, String milestonesUrl, String teamsUrl, Boolean fork, String issuesUrl, String eventsUrl, String issueEventsUrl, String assigneesUrl, Integer openIssues, Integer watchersCount, String nodeId, Object homepage, Integer forksCount) {
        this.allowForking = allowForking;
        this.stargazersCount = stargazersCount;
        this.isTemplate = isTemplate;
        this.pushedAt = pushedAt;
        this.subscriptionUrl = subscriptionUrl;
        this.language = language;
        this.branchesUrl = branchesUrl;
        this.issueCommentUrl = issueCommentUrl;
        this.labelsUrl = labelsUrl;
        this.subscribersUrl = subscribersUrl;
        this.releasesUrl = releasesUrl;
        this.svnUrl = svnUrl;
        this.id = id;
        this.hasDiscussions = hasDiscussions;
        this.forks = forks;
        this.archiveUrl = archiveUrl;
        this.gitRefsUrl = gitRefsUrl;
        this.forksUrl = forksUrl;
        this.visibility = visibility;
        this.statusesUrl = statusesUrl;
        this.sshUrl = sshUrl;
        this.license = license;
        this.fullName = fullName;
        this.size = size;
        this.languagesUrl = languagesUrl;
        this.htmlUrl = htmlUrl;
        this.collaboratorsUrl = collaboratorsUrl;
        this.cloneUrl = cloneUrl;
        this.name = name;
        this.pullsUrl = pullsUrl;
        this.defaultBranch = defaultBranch;
        this.hooksUrl = hooksUrl;
        this.treesUrl = treesUrl;
        this.tagsUrl = tagsUrl;
        this.jsonMemberPrivate = jsonMemberPrivate;
        this.contributorsUrl = contributorsUrl;
        this.hasDownloads = hasDownloads;
        this.notificationsUrl = notificationsUrl;
        this.openIssuesCount = openIssuesCount;
        this.description = description;
        this.createdAt = createdAt;
        this.watchers = watchers;
        this.keysUrl = keysUrl;
        this.deploymentsUrl = deploymentsUrl;
        this.hasProjects = hasProjects;
        this.archived = archived;
        this.hasWiki = hasWiki;
        this.updatedAt = updatedAt;
        this.commentsUrl = commentsUrl;
        this.stargazersUrl = stargazersUrl;
        this.disabled = disabled;
        this.gitUrl = gitUrl;
        this.hasPages = hasPages;
        this.commitsUrl = commitsUrl;
        this.compareUrl = compareUrl;
        this.gitCommitsUrl = gitCommitsUrl;
        this.topics = topics;
        this.blobsUrl = blobsUrl;
        this.gitTagsUrl = gitTagsUrl;
        this.mergesUrl = mergesUrl;
        this.downloadsUrl = downloadsUrl;
        this.hasIssues = hasIssues;
        this.webCommitSignoffRequired = webCommitSignoffRequired;
        this.url = url;
        this.contentsUrl = contentsUrl;
        this.mirrorUrl = mirrorUrl;
        this.milestonesUrl = milestonesUrl;
        this.teamsUrl = teamsUrl;
        this.fork = fork;
        this.issuesUrl = issuesUrl;
        this.eventsUrl = eventsUrl;
        this.issueEventsUrl = issueEventsUrl;
        this.assigneesUrl = assigneesUrl;
        this.openIssues = openIssues;
        this.watchersCount = watchersCount;
        this.nodeId = nodeId;
        this.homepage = homepage;
        this.forksCount = forksCount;
    }


    public Boolean getAllowForking() {
        return allowForking;
    }

    public void setAllowForking(Boolean allowForking) {
        this.allowForking = allowForking;
    }

    public Integer getStargazersCount() {
        return stargazersCount;
    }

    public void setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public Boolean getTemplate() {
        return isTemplate;
    }

    public void setTemplate(Boolean template) {
        isTemplate = template;
    }

    public String getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBranchesUrl() {
        return branchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public String getReleasesUrl() {
        return releasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public String getSvnUrl() {
        return svnUrl;
    }

    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getHasDiscussions() {
        return hasDiscussions;
    }

    public void setHasDiscussions(Boolean hasDiscussions) {
        this.hasDiscussions = hasDiscussions;
    }

    public Integer getForks() {
        return forks;
    }

    public void setForks(Integer forks) {
        this.forks = forks;
    }

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public Object getLicense() {
        return license;
    }

    public void setLicense(Object license) {
        this.license = license;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public String getTreesUrl() {
        return treesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public String getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public Boolean getJsonMemberPrivate() {
        return jsonMemberPrivate;
    }

    public void setJsonMemberPrivate(Boolean jsonMemberPrivate) {
        this.jsonMemberPrivate = jsonMemberPrivate;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getWatchers() {
        return watchers;
    }

    public void setWatchers(Integer watchers) {
        this.watchers = watchers;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    public Boolean getHasProjects() {
        return hasProjects;
    }

    public void setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Boolean getHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public Boolean getHasPages() {
        return hasPages;
    }

    public void setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public List<Object> getTopics() {
        return topics;
    }

    public void setTopics(List<Object> topics) {
        this.topics = topics;
    }

    public String getBlobsUrl() {
        return blobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public String getMergesUrl() {
        return mergesUrl;
    }

    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public Boolean getHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public Boolean getWebCommitSignoffRequired() {
        return webCommitSignoffRequired;
    }

    public void setWebCommitSignoffRequired(Boolean webCommitSignoffRequired) {
        this.webCommitSignoffRequired = webCommitSignoffRequired;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public Object getMirrorUrl() {
        return mirrorUrl;
    }

    public void setMirrorUrl(Object mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public Boolean getFork() {
        return fork;
    }

    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public Integer getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
    }

    public Integer getWatchersCount() {
        return watchersCount;
    }

    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Object getHomepage() {
        return homepage;
    }

    public void setHomepage(Object homepage) {
        this.homepage = homepage;
    }

    public Integer getForksCount() {
        return forksCount;
    }

    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }
}
