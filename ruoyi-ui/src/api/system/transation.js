import request from '@/utils/request'

// 查询交易列表
export function listTransation(query) {
  return request({
    url: '/system/transation/list',
    method: 'get',
    params: query
  })
}

// 查询交易详细
export function getTransation(transId) {
  return request({
    url: '/system/transation/' + transId,
    method: 'get'
  })
}

// 新增交易
export function addTransation(data) {
  return request({
    url: '/system/transation',
    method: 'post',
    data: data
  })
}

// 修改交易
export function updateTransation(data) {
  return request({
    url: '/system/transation',
    method: 'put',
    data: data
  })
}

// 删除交易
export function delTransation(transId) {
  return request({
    url: '/system/transation/' + transId,
    method: 'delete'
  })
}
