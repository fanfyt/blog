const state = {
    articles: [],
};

const mutations = {
    SET_ARTICLES(state, articles) {
        state.articles = articles;
    },
    EDIT_ARTICLE(state, article) {
        const index = state.articles.findIndex(a => a.id === article.id);
        if (index !== -1) {
            state.articles.splice(index, 1, article);
        }
    },
};

const actions = {
    fetchArticles({ commit }) {
        // 获取文章逻辑
        commit('SET_ARTICLES', articles);
    },
    editArticle({ commit }, article) {
        // 编辑文章逻辑
        commit('EDIT_ARTICLE', article);
    },
};

export default {
    namespaced: true,
    state,
    mutations,
    actions,
};
