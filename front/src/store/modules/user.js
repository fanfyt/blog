const state = {
    user: null,
};

const mutations = {
    SET_USER(state, user) {
        state.user = user;
    },
};

const actions = {
    register({ commit }, user) {
        // 注册逻辑
        commit('SET_USER', user);
    },
    login({ commit }, user) {
        // 登录逻辑
        commit('SET_USER', user);
    },
};

export default {
    namespaced: true,
    state,
    mutations,
    actions,
};
